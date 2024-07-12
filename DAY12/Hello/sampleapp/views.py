##from django.http import HttpResponse  
##def function_view(request):  
##    if request.method == 'GET':  
##        # View logic will place here  
##        return HttpResponse('response')
#If we implement the class based view, it would look as follows.

from django.http import HttpResponse  
from django.views import View  
class NewView(View):  
    def get(self, request):  
        # View logic will place here  
        return HttpResponse('response')  

from .models import Employee  
from .forms import EmployeeForm  
from django.views.generic.edit import CreateView  
from django.views import View
from django.shortcuts import render
class EmployeeCreate(View):
    form_class=EmployeeForm
    initial={"key":"value"}
    template_name='employee_form.html'

    def get(self, request, *args, **kwargs):
        form = self.form_class(initial=self.initial)
        return render(request, self.template_name, {"form": form})
    def post(self, request, *args, **kwargs):
        form = self.form_class(request.POST)
        if form.is_valid():
            form.save()
            return HttpResponse("Data Saved")
            # <process form cleaned data>
            #return HttpResponseRedirect("/success/")

        return render(request, self.template_name, {"form": form})
#display & save form data   
def saveEmployee(request):
    # dictionary for initial data with field names as keys
    context ={}
    # add the dictionary during initialization
    form = EmployeeForm(request.POST or None)
    if form.is_valid():
        form.save()
        return HttpResponse("Data Saved")
    context['form']= form
    return render(request, "employee_form1.html", context)    
##display form
def view_employee_insert (request):
    context ={}
    context['form']=EmployeeForm
    return render(request, 'employee_form2.html', context)
##save form data
def processEmployeeInsert(request):
    if request.POST:
        form = EmployeeForm(request.POST or None)
    if form.is_valid():
        form.save()
        return HttpResponse("Data Saved")
    else:
        return HttpResponse("Data Not Saved")







    
        
