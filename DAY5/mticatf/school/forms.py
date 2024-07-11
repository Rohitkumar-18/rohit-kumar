from django import forms
# import GeeksModel from models.py
from .models import StudentModel
from .models import CourseModel
from .models import EnrollModel
# create a ModelForm
class StudentForm(forms.ModelForm):
    # specify the name of model to use
    class Meta:
        model=StudentModel
        fields="__all__"
class CourseForm(forms.ModelForm):
    # specify the name of model to use
     class Meta:
         model=CourseModel
         fields="__all__"
class  EnrollForm(forms.ModelForm):
    # specify the name of model to use
    class Meta:
        model=EnrollModel
        fields="__all__"
        
        
