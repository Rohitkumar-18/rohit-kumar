from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
from .forms import ExamForm
from .models import ExamMaster
from .forms import BatchForm
from .models import BatchMaster
from .forms import CourseForm
from .models import CourseMaster
from .forms import SemForm
from .models import SemMaster
from .forms  import PaperForm
from .models  import PaperMaster
from .forms  import StudentForm
from .models  import StudentMaster
# Create your views here.
def insert_view(request):
    context={}
    context['form']=BatchForm()
    return render(request,"insert_view.html",context)
def displayBatchInput(request):
    return render(request,'batch.html')


def process_batch_entry(request):
    if request.method=='POST':
        batchNo_inp=request.POST.get('batchNo')
        batchId_inp=request.POST.get('batchId')
        ob=BatchMaster(batchNo=batchNo_inp,batchId=batchId_inp)
        ob.save()
        return HttpResponse("Data Successfully inserted")
    else:
        return HttpResponse("Invalid request method")
    
def display_batch(request):
    allstu=BatchMaster.objects.all().values()
    temp=loader.get_template('all_batch.html')
    context={
        'data':allstu,
        }
    return HttpResponse(temp.render(context,request))
def display_image(request):
    return render(request,'back.html')

def insert1_view(request):
    context={}
    context['form']=CourseForm()
    return render(request,"insert1_view.html",context)
def displayCourseInput(request):
    return render(request,'course.html')


def process_course_entry(request):
    if request.method=='POST':
        course_inp=request.POST.get('course')
        courseId_inp=request.POST.get('courseId')
        ob=CourseMaster(course=course_inp,courseId=courseId_inp)
        ob.save()
        return HttpResponse("Data Successfully inserted")
    else:
        return HttpResponse("Invalid request method")
def display_course(request):
    allcourse=CourseMaster.objects.all().values()
    temp=loader.get_template('all_course.html')
    context={
        'data':allcourse,
        }
    return HttpResponse(temp.render(context,request))
    
def insert2_view(request):
    context={}
    context['form']=ExamForm()
    return render(request,"insert2_view.html",context)
def displayExamInput(request):
    return render(request,'exam.html')


def process_exam_entry(request):
    if request.method=='POST':
        examId_inp=request.POST.get('examId')
        examType_inp=request.POST.get('examType')
        ob=ExamMaster(examId=rxamId_inp,examType=examType_inp)
        ob.save()
        return HttpResponse("Data Successfully inserted")
    else:
        return HttpResponse("Invalid request method")
def display_exam(request):
    allexam=ExamMaster.objects.all().values()
    temp=loader.get_template('all_exam.html')
    context={
        'data':allexam,
        }
    return HttpResponse(temp.render(context,request))  
def insert3_view(request):
    context={}
    context['form']=PaperForm()
    return render(request,"insert3_view.html",context)
def displayPaperInput(request):
    return render(request,'paper.html')


def process_paper_entry(request):
    if request.method=='POST':
        papaerCode_inp=request.POST.get('paperCode')
        paperType_inp=request.POST.get('paperType')
        papershtName_inp=request.POST.get('papershtName')
        paperNAme_inp=request.POST.get('paperName')
        ob=PaperMaster(paperCode=paperCode_inp,paperType=paperType_inp,papershtName=papershtName_inp,paperName=paperName_inp)
        ob.save()
        return HttpResponse("Data Successfully inserted")
    else:
        return HttpResponse("Invalid request method")
def display_paper(request):
    allpaper=PaperMaster.objects.all().values()
    temp=loader.get_template('all_paper.html')
    context={
        'data':allpaper,
        }
    return HttpResponse(temp.render(context,request))
def insert4_view(request):
    context={}
    context['form']=SemForm()
    return render(request,"insert4_view.html",context)
def displaySemInput(request):
    return render(request,'sem.html')


def process_sem_entry(request):
    if request.method=='POST':
        sem_inp=request.POST.get('sem')
        semId_inp=request.POST.get('semId')
        ob=SemMaster(sem=sem_inp,semId=semId_inp)
        ob.save()
        return HttpResponse("Data Successfully inserted")
    else:
        return HttpResponse("Invalid request method")
def display_sem(request):
    allsem=SemMaster.objects.all().values()
    temp=loader.get_template('all_sem.html')
    context={
        'data':allsem,
        }
    return HttpResponse(temp.render(context,request))  
def insert5_view(request):
    context={}
    context['form']=StudentForm()
    return render(request,"insert5_view.html",context)
def displayStudentInput(request):
    return render(request,'student.html')


def process_student_entry(request):
    if request.method=='POST':
        batchNo_inp=request.POST.get('batchNo')
        sem_inp=request.POST.get('sem')
        ob=StudentMaster(batchNo=batchNo_inp,sem=sem_inp)
        ob.save()
        return HttpResponse("Data Successfully inserted")
    else:
        return HttpResponse("Invalid request method")
def display_student(request):
    allstudent=SemMaster.objects.all().values()
    temp=loader.get_template('all_student.html')
    context={
        'data':allstudent,
        }
    return HttpResponse(temp.render(context,request))  

