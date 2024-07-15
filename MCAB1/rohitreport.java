from django.shortcuts import render, get_object_or_404, redirect
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
from .forms import SearchForm2
from .forms import SearchForm3
from .forms import SearchForm4
from .forms import SearchForm5




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
        form = SearchForm2(request.GET)
        if form.is_valid():
            query = form.cleaned_data.get('query')
            results = CourseMaster.objects.filter(course=query)  
        else:
            results = None
    else:
        form = SearchForm2()
        results = None
    
    return render(request, 'search_results1.html', {'form': form, 'results': results})


def search_Paperview(request):
    if request.method == 'GET':
        form = SearchForm3(request.GET)
        if form.is_valid():
            query = form.cleaned_data.get('query')
            results = PaperMaster.objects.filter(paperCode=query)  
        else:
            results = None
    else:
        form = SearchForm3()
        results = None
    
    return render(request, 'search_results2.html', {'form': form, 'results': results})

def search_Semview(request):
    if request.method == 'GET':
        form = SearchForm4(request.GET)
        if form.is_valid():
            query = form.cleaned_data.get('query')
            results = SemMaster.objects.filter(semId=query)  
        else:
            results = None
    else:
        form = SearchForm4()
        results = None
    
    return render(request, 'search_results3.html', {'form': form, 'results': results})


def search_Examview(request):
    if request.method == 'GET':
        form = SearchForm5(request.GET)
        if form.is_valid():
            query = form.cleaned_data.get('query')
            results = ExamMaster.objects.filter(examType=query)  
        else:
            results = None
    else:
        form = SearchForm5()
        results = None
    
    return render(request, 'search_results4.html', {'form': form, 'results': results})

def edit_batch(request, batch_id):
    batch = get_object_or_404(BatchMaster, pk=batch_id)
    if request.method == 'POST':
        form = BatchForm(request.POST, instance=batch)
        if form.is_valid():
            form.save()
            return redirect('batch_detail', batch_id=batch_id)
    else:
        form = BatchForm(instance=batch)
    
    return render(request, 'edit_batch.html', {'form': form})

def batch_detail(request, batch_id):
    batch = get_object_or_404(BatchMaster, pk=batch_id)
    return render(request, 'batch_detail.html', {'batch': batch})
def  batch_all_detail(request):
    ob=BatchMaster.objects.all().values()
    context={
        'data':ob
        }
    temp=loader.get_template('batch_all_detail.html')
    return HttpResponse(temp.render(context,request))

def edit_course(request,id):
    obj = get_object_or_404(CourseMaster, pk=id)
    if request.method == 'POST':
        form = CourseForm(request.POST, instance=obj)
        if form.is_valid():
            form.save()
            return redirect('course_detail')
    else:
        form = CourseForm(instance=course)
    
    return render(request, 'edit_course.html', {'form': form})

def course_detail(request, id):
    course = get_object_or_404(CourseMaster, pk=id)
    return render(request, 'course_detail.html', {'course': course})
def  course_all_detail(request):
    ob=CourseMaster.objects.all().values()
    context={
        'data':ob
        }
    temp=loader.get_template('course_all_detail.html')
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
        course_inp=request.POST.get('course')
        studRegNo_inp=request.POST.get('studRegNo')
        studName_inp=request.POST.get('studName')
        ob=StudentMaster(batchNo=batchNo_inp,sem=sem_inp, course=course_inp, studRegNo=studRegNo_inp,studName=studName_inp) 
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


def insert6_view(request):
    context={}
    context['form']=StudentInternalTransForm()
    return render(request,"insert6_view.html",context)
def displayStudentInternalTransInput(request):
    return render(request,'studentinternaltrans.html')


def process_studentinternaltrans_entry(request):
    if request.method=='POST':
        course_inp=request.POST.get('course')
        batch_inp=request.POST.get('batch')
        sem_inp=request.POST.get('sem')
        examType_inp=request.POST('examType')
        studregNo_inp=request.POST('studregNo')
        nameoftheStud_inp=request.POST('nameoftheStud')
        paperCode_inp=request.POST('paperCode')
        ob=StudentInternalTransMaster(batch=batch_inp, sem=sem_inp, examType=examType_inp, studregNo=studregNo_inp,nameoftheStud=nameoftheStud_inp,paperCode=paperCode_inp)
        ob.save()
        return HttpResponse("Data Successfully inserted")
    else:
        return HttpResponse("Invalid request method")
def display_studentinternaltrans(request):
    allstudentinternaltrans=SemMaster.objects.all().values()
    temp=loader.get_template('all_studentinternaltrans.html')
    context={
        'data':allstudentinternaltrans,
        }
    return HttpResponse(temp.render(context,request))  
    

    
from django . urls import path
from . import views
urlpatterns=[
    path('display_Batch/',views.display_Batch,name='display_Batch'),
    path('display_Paper/',views.display_Paper,name='display_Paper'),
    path('display_Student/',views.display_Student,name='display_Student'),
    path('display_StudentTrans/',views.display_StudentTrans,name='display_StudentTrans'),
    path('display_Course/',views.display_Course,name='display_Course'),
    path('display_Exam/',views.display_Exam,name='display_Exam'),
    path('display_Sem/',views.display_Sem,name='display_Sem'),
    
    path('process_batch_entry/',views.process_batch_entry,name='process_batch_entry'),
    path('insert_view/',views.insert_view,name='insert_view'),
    path('displayBatchInput/',views.displayBatchInput,name='displayBatchInput'),
    path('delete/<pk>/',views.delete,name='delete'),
    path('delete_Batch/',views.delete_Batch,name='delete_Batch'),
    path('search/', views.search_view, name='search'),
    path('edit/<int:batch_id>/', views.edit_batch, name='edit_batch'),
    path('batch/<int:batch_id>/', views.batch_detail, name='batch_detail'),
    path('batch_all_detail/',views.batch_all_detail,
         name='batch_all_detail'),
   

    
    path('display_image/',views.display_image,name='display_image'),
    path('process_course_entry/',views.process_course_entry,name='process_course_entry'),
    path('displayCourseInput/',views.displayCourseInput,name='displayCourseInput'),
    path('insert_courseview/',views.insert_courseview,name='insert_courseview'),
    path('delete1/<pk>/',views.delete1,name='delete1'),
    path('delete_Course/',views.delete_Course,name='delete_Course'),
    path('search2/', views.search_Courseview, name='search2'),
    path('edit/<int:course>/', views.edit_course, name='edit_course'),
    path('course/<int:id>/', views.course_detail, name='course_detail'),
    path('course_all_detail/',views.course_all_detail,
         name='course_all_detail'),
   
    
    path('process_Paper_entry/',views.process_Paper_entry,name='process_Paper_entry'),
    path('displayPaperInput/',views.displayPaperInput,name='displayPaperInput'),
    path('insert_paperview/',views.insert_paperview,name='insert_paperview'),
    path('delete2/<pk>/',views.delete2,name='delete2'),
    path('delete_Paper/',views.delete_Paper,name='delete_Paper'),
    path('search_Paperview/', views.search_Paperview, name='search_Paperview'),
    
    
    path('process_Sem_entry/',views.process_Sem_entry,name='process_Sem_entry'),
    path('displaySemInput/',views.displaySemInput,name='displaySemInput'),
    path('insert_semview/',views.insert_semview,name='insert_semview'),
    path('delete3/<pk>/',views.delete3,name='delete3'),
    path('delete_Sem/',views.delete_Sem,name='delete_Sem'),
    path('search_Semview/', views.search_Semview, name='search_Semview'),
    
    
    path('process_Exam_entry/',views.process_Exam_entry,name='process_Exam_entry'),
    path('displayExamInput/',views.displayExamInput,name='displayExamInput'),
    path('insert_examview/',views.insert_examview,name='insert_examview'),
    path('delete4/<pk>/',views.delete4,name='delete4'),
    path('delete_Exam/',views.delete_Exam,name='delete_Exam'),
    path('search_Examview/', views.search_Examview, name='search_Examview'),
    
   

         
    path('insert5_view/',views.insert5_view,name='insert5_view'),
    path('displayStudentInput/',views.displayStudentInput,name='displayStudentInput'),
    path('process_student_entry/',views.process_student_entry,name='process_student_entry'),
    path('display_student/',views.display_student,name='display_student'),
    

     
    path('insert6_view/',views.insert6_view,name='insert6_view'),
    path('displayStudentInternalTransInput/',views.displayStudentInternalTransInput,name='displayStudentInternalTransInput'),
    path('process_studentinternaltrans_entry/',views.process_studentinternaltrans_entry,name='process_studentinternaltrans_entry'),
    path('display_studentinternaltrans/',views.display_studentinternaltrans,name='studentinternaltrans'),

    
    
    
    
    ]
from django import forms
from . models import BatchMaster
from . models import PaperMaster
from . models import CourseMaster
from . models import SemMaster
from . models import ExamMaster
from . models import StudentMaster
from . models import StudentInternalTransMaster

class BatchForm(forms.ModelForm):
    class Meta:
        model=BatchMaster
        fields='__all__'
class PaperForm(forms.ModelForm):
    class Meta:
        model=PaperMaster
        fields='__all__'
class CourseForm(forms.ModelForm):
    class Meta:
        model=CourseMaster
        fields='__all__'
class SemForm(forms.ModelForm):
    class Meta:
        model=SemMaster
        fields='__all__'
class ExamForm(forms.ModelForm):
    class Meta:
        model=ExamMaster
        fields='__all__'
class StudentForm(forms.ModelForm):
    class Meta:
        model=StudentMaster
        fields='__all__'
class StudentInternalTransForm(forms.ModelForm):
    class Meta:
        model=StudentInternalTransMaster
        fields='__all__'





from django.contrib import admin
from . models import BatchMaster
from . models import PaperMaster
from . models import CourseMaster
from . models import SemMaster
from . models import ExamMaster
from . models import StudentMaster
from . models import StudentInternalTransMaster

# Register your models here.
admin.site.register(BatchMaster)
admin.site.register(PaperMaster)
admin.site.register(CourseMaster)
admin.site.register(SemMaster)
admin.site.register(ExamMaster)
admin.site.register(StudentMaster)
admin.site.register(StudentInternalTransMaster)

"""
Django settings for project1 project.

Generated by 'django-admin startproject' using Django 5.0.6.

For more information on this file, see
https://docs.djangoproject.com/en/5.0/topics/settings/

For the full list of settings and their values, see
https://docs.djangoproject.com/en/5.0/ref/settings/
"""

from pathlib import Path

# Build paths inside the project like this: BASE_DIR / 'subdir'.
BASE_DIR = Path(__file__).resolve().parent.parent


# Quick-start development settings - unsuitable for production
# See https://docs.djangoproject.com/en/5.0/howto/deployment/checklist/

# SECURITY WARNING: keep the secret key used in production secret!
SECRET_KEY = 'django-insecure-w-$6*i9=_u+*evkjd%9rv5l$7-g^@e9b$k&$wjgcujwzrur&tb'

# SECURITY WARNING: don't run with debug turned on in production!
DEBUG = True

ALLOWED_HOSTS = []


# Application definition

INSTALLED_APPS = [
    'app1',
    'django.contrib.admin',
    'django.contrib.auth',
    'django.contrib.contenttypes',
    'django.contrib.sessions',
    'django.contrib.messages',
    'django.contrib.staticfiles',
]

MIDDLEWARE = [
    'django.middleware.security.SecurityMiddleware',
    'django.contrib.sessions.middleware.SessionMiddleware',
    'django.middleware.common.CommonMiddleware',
    'django.middleware.csrf.CsrfViewMiddleware',
    'django.contrib.auth.middleware.AuthenticationMiddleware',
    'django.contrib.messages.middleware.MessageMiddleware',
    'django.middleware.clickjacking.XFrameOptionsMiddleware',
]

ROOT_URLCONF = 'project1.urls'

TEMPLATES = [
    {
        'BACKEND': 'django.template.backends.django.DjangoTemplates',
        'DIRS': [],
        'APP_DIRS': True,
        'OPTIONS': {
            'context_processors': [
                'django.template.context_processors.debug',
                'django.template.context_processors.request',
                'django.contrib.auth.context_processors.auth',
                'django.contrib.messages.context_processors.messages',
            ],
        },
    },
]

WSGI_APPLICATION = 'project1.wsgi.application'


# Database
# https://docs.djangoproject.com/en/5.0/ref/settings/#databases

DATABASES = {
    'default': {
        'ENGINE': 'django.db.backends.sqlite3',
        'NAME': BASE_DIR / 'db.sqlite3',
    }
}


# Password validation
# https://docs.djangoproject.com/en/5.0/ref/settings/#auth-password-validators

AUTH_PASSWORD_VALIDATORS = [
    {
        'NAME': 'django.contrib.auth.password_validation.UserAttributeSimilarityValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.MinimumLengthValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.CommonPasswordValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.NumericPasswordValidator',
    },
]


# Internationalization
# https://docs.djangoproject.com/en/5.0/topics/i18n/

LANGUAGE_CODE = 'en-us'

TIME_ZONE = 'UTC'

USE_I18N = True

USE_TZ = True


# Static files (CSS, JavaScript, Images)
# https://docs.djangoproject.com/en/5.0/howto/static-files/

STATIC_URL = 'static/'

# Default primary key field type
# https://docs.djangoproject.com/en/5.0/ref/settings/#default-auto-field

DEFAULT_AUTO_FIELD = 'django.db.models.BigAutoField'
"""
URL configuration for project1 project.

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/5.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path,include

urlpatterns = [
    path('admin/', admin.site.urls),
    path('app1/' ,include('app1.urls')),
]
ALL_BATCH
{% extends "homepage.html" %}
{% block content %}
<h3>BatchMaster-View</h3>
<center>
<table border=1>
<tr><th>Batchno</th><th>Batchid</th></tr>
{% for x in data %}
<tr>
<td>{{x.batchNo}}</td>
<td>{{x.batchId}}</td>
{% endfor %}
</table>
<tr>
<td><a href="{% url 'display_image' %}"><button type="submit">HOME</button></a></td>
</tr>
</center>
{% endblock %}

ALL_COURSE

{% extends "homepage.html" %}
{% block content %}
<h3>CourseMaster-View</h3>
<center>
<table border=1>
<tr><th>Course</th><th>CourseId</th></tr>
{% for x in data %}
<tr>
<td>{{x.course}}</td>
<td>{{x.courseId}}</td>
{% endfor %}
</table>
<tr>
<td><a href="{% url 'display_image' %}"><button type="submit">HOME</button></a></td>
<tr>
</center>
{% endblock %}

ALL_EXAM

{% extends "homepage.html" %}
{% block content %}
<h3>Exam Master-View</h3>
<center>
<table border=1>
<tr><th>ExamId</th><th>ExamType</th></tr>
{% for x in data %}
<tr>
<td>{{x.examId}}</td>
<td>{{x.examType}}</td>
{% endfor %}
</table>
<tr>
<td><a href="{% url 'display_image' %}"><button type="submit">HOME</button></a></td>
<tr>
</center>
{% endblock %}

ALL_PAPER
{% extends "homepage.html" %}
{% block content %}
<h3>PaperMaster-View</h3>
<center>
<table border=1>
<tr><th>PaperCode</th><th>PaperType</th><th>PaperShtName</th><th>PaperName</th></tr>
{% for x in data %}
<tr>
<td>{{x.paperCode}}</td>
<td>{{x.papertype}}</td>
<td>{{x.paperShtName}}</td>
<td>{{x.paperName}}</td>
{% endfor %}
</table>
<tr>
<td><a href="{% url 'display_image' %}"><button type="submit">HOME</button></a></td>
<tr>
</center>
{% endblock %}

ALL_STUDENT
<!DOCTYPE html>
<html><body bgcolor=lavender><h1>Students</h1>
<table border=1>
<tr><th>Batch</th><th>Course</th><th>Sem</th><th>StudRegNo</th><th>StudName</th></tr>
{% for x in data %}
<tr>
<td>{{x.batchNo}}</td>
<td>{{x.course}}</td>
<td>{{x.sem}}</td>
<td>{{x.studRegNo}}</td>
<td>{{x.studName}}</td>

</tr>
{% endfor %}
</table>
</body></html>

ALL_STUDENTINTERNAL
<!DOCTYPE html><html><body><h1>StudentInternalTransMaster</h1>
<table border=1>
<tr><th>course</th><th>batch</th><th>sem</th><th>examType</th><th>studregNo</th><th>nameoftheStud</th><th>paperCode</th></tr>
{% for x in data %}
<tr>      
         <td>{{x.course}}</td>
          <td>{{x.sem}}</td>
	<td>{{x.batch}}</td>
	<td>{{x.examType}}</td>  
        <td>{{x.studregNo}}</td>
        <td>{{x.nameoftheStud}}</td>
        <td>{{x.paperCode}}</td>
        
</tr>
{% endfor %}

</table>
<a href="{% url 'display_image' %}"><button type="button">HOME</button></a>
</body></html>