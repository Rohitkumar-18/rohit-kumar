from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
from .forms import StudentForm
from .forms import CourseForm
from .forms import EnrollForm
from .models import StudentModel
from .models import CourseModel
from .models import EnrollModel
# Create your views here.
def displayEnrollInput(request):
   return render(request,'enroll_entry.html')
   context={}
   context['form']=EnrollForm()
   return render(request,"enroll_entry.html",context)
def process_enroll_entry(request):
    if request.method=='POST':
        sno_inp=(request.POST.get('sno'))
        cno_inp=request.POST.get('cno')
        jdate_inp=request.POST.get('jdate')
        # create a new patient entry in the database
        ob=EnrollModel(sno=sno_inp,cno=cno_inp,jdate=jdate_inp)
        ob.save()
        return HttpResponse("Data successfully inserted!")
    else:
        return HttpResponse("Invalid request method.")
def displayCourseInput(request):
   return render(request,'course_entry.html')
   context={}
   context['form']=CourseForm()
   return render(request,"course_entry.html",context)
def process_course_entry(request):
    if request.method=='POST':
        cno_inp=int(request.POST.get('cno'))
        cname_inp=request.POST.get('cname')
        # create a new patient entry in the database
        ob=CourseModel(cno=cno_inp,cname=cname_inp,)
        ob.save()
        return HttpResponse("Data successfully inserted!")
    else:
        return HttpResponse("Invalid request method.")
def displayStudentInput(request):
    return render(request,'student_entry.html')
    context={}
    context['form']=StudentForm()
    return render(request,"student_entry.html",context)

def insert_studentview(request):
   context={}
   context['form']=StudentForm()
   return render(request,"insert_studentview.html",context)
def process_student_entry(request):
    if request.method=='POST':
        sno_inp=int(request.POST.get('sno'))
        sname_inp=request.POST.get('sname')
        age_inp=int(request.POST.get('age'))
        # create a new patient entry in the database
        ob=StudentModel(sno=sno_inp,sname=sname_inp,age=age_inp)
        ob.save()
        return HttpResponse("Data successfully inserted!")
    else:
        return HttpResponase("Invalid request method.")
    
def display_enroll(request):
    allenroll=EnrollModel.objects.all().values()
    temp=loader.get_template('all_enroll.html')
    context={
        'data':allenroll,
        }
    return HttpResponse(temp.render(context,request))
def display_course(request):
    allcourse=CourseModel.objects.all().values()
    temp=loader.get_template('all_course.html')
    context={
        'data':allcourse,
        }
    return HttpResponse(temp.render(context,request))
def insert_view(request):
    context={}
    context['form']=StudentForm()
    return render(request,"insert_view.html",context)
def display_student(request):
    allstu=StudentModel.objects.all().values()
    temp=loader.get_template('all_student.html')
    context={
        'data':allstu,
        }
    return HttpResponse(temp.render(context,request))

def displayindex(request):
    return HttpResponse('rohit')
def displayDAY1(request):
    return render(request,'DAY1.html')
def displayprogram1(request):
    return render(request,'program1.html')
def displayprogram2(request):
    return render(request,'program2.html')
def displayprogram3(request):
    return render(request,'program3.html')
def displayprogram4(request):
    return render(request,'program4.html')
def displayprogram5(request):
    return render(request,'program5.html')
def displayprogram6(request):
    return render(request,'program6.html')
def displayprogram7(request):
    return render(request,'program7.html')
def displayprogram8(request):
    return render(request,'program8.html')
def displayprogram9(request):
    return render(request,'program9.html')














