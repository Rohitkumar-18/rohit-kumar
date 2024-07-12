from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
from . forms import *
from . models import *
# Create your views here.

def homes_view(request):
    context ={}
    context['form']=ExamForm()
    return render(request,"homes_view.html",context)
def home_view(request):
    if request.method == 'POST':
        exam_details = ExamForm(request.POST)
        if exam_details.is_valid():
         exam_details.save()
         return HttpResponse("Data submitted successfully")
        else:

         return render(request, 'home.html', {'form':user_details})
    else:
         form = ExamForm(None)
         return render(request, 'home.html', {'form':form})

def insert_view(request):
    context ={}
    context['form']=ExamForm()
    return render(request,"insert_view.html",context)

def add_data(request):
    context ={}
    context['form']=ExamForm()
    return render(request,"addexam.html",context)
def displayExamInput(request):
    context={}
    context['form']=ExamForm()
    return render(request,"exam_entry.html",context)
def process_exam_entry(request):
    if request.method == 'POST':
        examId_inp=request.POST.get('examId')
        examType_inp=request.POST.get('examType')
        #create a new patient entry in the database using the
        ob =ExamMaster(examId=examId_inp,examType=examType_inp)
        return HttpResponse("Data successfully inserted!.")
    else:
        return HttpResponse("Invalid request method.")
def display_exam(request):
    allexam=ExamMaster.objects.all().values()
    temp=loader.get_template('all_exam.html')
    context={
        'data':allexam,
        }
    return HttpResponse(temp.render(context,request))



  
  
       
