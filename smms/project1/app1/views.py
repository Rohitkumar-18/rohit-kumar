from django.shortcuts import render
from django . http import HttpResponse
from django . template import loader
from . forms import BatchForm
from . forms import CourseForm
from . forms import PaperForm
from . forms import SemForm
from . forms import ExamForm
from . models import BatchMaster
from . models import PaperMaster
from . models import CourseMaster
from . models import SemMaster
from . models import ExamMaster
from . models import StudentMaster
from . models import StudentInternalTransMaster
from .forms import SearchForm


# Create your views here.

def insert_view(request):
    context={}
    context['form']=BatchForm()
    return render(request,"insert_view.html",context)
def displayBatchInput(request):
    return render(request,'batch_entry.html')
def process_batch_entry(request):
    if request.method== 'POST':
        batchNo_inp=int(request.POST.get('batchNo'))
        batchId_inp=request.POST.get('batchId')
        ob=BatchMaster(batchNo=batchNo_inp,batchId=batchId_inp)
        ob.save()
        return render(request,'retrive.html')
    else:
        return HttpResponse("invalid request method...")

def delete_Batch(request):
    allbatch=BatchMaster.objects.all().values()
    temp=loader.get_template("delete_batch.html")
    context={
        'data':allbatch,
        }
    return HttpResponse(temp.render(context,request))

def display_Batch(request):
    allbatch=BatchMaster.objects.all().values()
    temp=loader.get_template('all_batch.html')
    context={
        'data':allbatch,
        }
    return HttpResponse(temp.render(context,request))



def display_Student(request):
    allstu=BatchMaster.objects.all().values()
    temp=loader.get_template('all_student.html')
    context={
        'data':allstu,
        }
    return HttpResponse(temp.render(context,request))
def display_Paper(request):
    allpaper=PaperMaster.objects.all().values()
    temp=loader.get_template('all_paper.html')
    context={
        'data':allpaper,
        }
    return HttpResponse(temp.render(context,request))
def display_Sem(request):
    allsem=SemMaster.objects.all().values()
    temp=loader.get_template('all_sem.html')
    context={
        'data':allsem,
        }
    return HttpResponse(temp.render(context,request))
def display_Exam(request):
    allexam=ExamMaster.objects.all().values()
    temp=loader.get_template('all_exam.html')
    context={
        'data':allexam,
        }
    return HttpResponse(temp.render(context,request))

def display_Course(request):
    allcourse=CourseMaster.objects.all().values()
    temp=loader.get_template('all_course.html')
    context={
        'data':allcourse,
        }
    return HttpResponse(temp.render(context,request))



def display_StudentTrans(request):
    allstudent=StudentInternalTransMaster.objects.all().values()
    temp=loader.get_template('all_trans.html')
    context={
        'data':allstudent,
        }
    return HttpResponse(temp.render(context,request))
def display_image(request):
    return render(request,"homepage.html")

def insert_courseview(request):
    context={}
    context['form']=CourseForm()
    return render(request,"insert_courseview.html",context)

def displayCourseInput(request):
    return render(request,'course_entry.html')
def process_course_entry(request):
    if request.method== 'POST':
        course_inp=request.POST.get('course')
        courseId_inp=int(request.POST.get('courseId'))
        ob=CourseMaster(course=course_inp,courseId=courseId_inp)
        ob.save()
        return render(request,'retrive.html')
    else:
        return HttpResponse("invalid request method...")


def delete_Course(request):
    allcourse=CourseMaster.objects.all().values()
    temp=loader.get_template("delete_course.html")
    context={
        'data':allcourse,
        }
    return HttpResponse(temp.render(context,request))

def delete1(request,pk):
    CourseMaster.objects.filter(id=pk).delete()
    return render(request,"retrive1.html")


def displayPaperInput(request):
    return render(request,'paper_entry.html')
def process_Paper_entry(request):
    if request.method== 'POST':
        paperCode_inp=request.POST.get('paperCode')
        papertype_inp=request.POST.get('papertype')
        paperShtName_inp=request.POST.get('paperShtName')
        paperName_inp=request.POST.get('paperName')
        ob=PaperMaster(paperCode=paperCode_inp,papertype=papertype_inp,paperShtName=paperShtName_inp,paperName=paperName_inp)
        ob.save()
        return render(request,'retrive.html')
    else:
        return HttpResponse("invalid request method...")

def delete_Paper(request):
    allpaper=PaperMaster.objects.all().values()
    temp=loader.get_template("delete_paper.html")
    context={
        'data':allpaper,
        }
    return HttpResponse(temp.render(context,request))

def delete2(request,pk):
    PaperMaster.objects.filter(id=pk).delete()
    return render(request,"retrive1.html")    

def insert_paperview(request):
    context={}
    context['form']=PaperForm()
    return render(request,"insert_paperview.html",context)

def displaySemInput(request):
    return render(request,'sem_entry.html')
def process_Sem_entry(request):
    if request.method== 'POST':
        sem_inp=request.POST.get('sem')
        semId_inp=int(request.POST.get('semId'))
        ob=SemMaster(sem=sem_inp,semId=semId_inp)
        ob.save()
        return render(request,'retrive.html')
    else:
        return HttpResponse("invalid request method...")

def delete_Sem(request):
    allsem=SemMaster.objects.all().values()
    temp=loader.get_template("delete_sem.html")
    context={
        'data':allsem,
        }
    return HttpResponse(temp.render(context,request))

def delete3(request,pk):
    SemMaster.objects.filter(id=pk).delete()
    return render(request,"retrive1.html")


       

def insert_semview(request):
    context={}
    context['form']=SemForm()
    return render(request,"insert_semview.html",context)

def displayExamInput(request):
    return render(request,'exam_entry.html')
def process_Exam_entry(request):
    if request.method== 'POST':
        examId_inp=int(request.POST.get('examId'))
        examType_inp=request.POST.get('examType')
        ob=ExamMaster(examId=examId_inp,examType=examType_inp)
        ob.save()
        return render(request,'retrive.html')
    else:
        return HttpResponse("invalid request method...")

def delete_Exam(request):
    allexam=ExamMaster.objects.all().values()
    temp=loader.get_template("delete_exam.html")
    context={
        'data':allexam,
        }
    return HttpResponse(temp.render(context,request))

def delete4(request,pk):
    ExamMaster.objects.filter(id=pk).delete()
    return render(request,"retrive1.html")    
 

def insert_examview(request):
    context={}
    context['form']=ExamForm()
    return render(request,"insert_examview.html",context)

def delete(request,pk):
    BatchMaster.objects.filter(id=pk).delete()
    return render(request,"retrive1.html")

def search_view(request):
    if request.method == 'GET':
        form = SearchForm(request.GET)
        if form.is_valid():
            query = form.cleaned_data.get('query')
            results = BatchMaster.objects.filter(batchNo=query)  
        else:
            results = None
    else:
        form = SearchForm()
        results = None
    
    return render(request, 'search_results.html', {'form': form, 'results': results})

def search_Courseview(request):
    if request.method == 'GET':
        form = SearchForm(request.GET)
        if form.is_valid():
            query = form.cleaned_data.get('query')
            results = CourseMaster.objects.filter(Course=query)  
        else:
            results = None
    else:
        form = SearchForm()
        results = None
    
    return render(request, 'search_results2.html', {'form': form, 'results': results})


    
