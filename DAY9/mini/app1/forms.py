from django import forms
from django.forms import ModelForm
from.models import ExamMaster
# import GeeksModels from models.py

class ExamForm(forms.ModelForm):
    # specify the name of models to use
    class Meta:
        model = ExamMaster
        fields="__all__"

   # method for cleaning the data
def clean(self):
      super(ExamForm, self).clean()

      # getting username and password from cleaned_data
      examid = self.cleaned_data.get('examid')
      examtype = self.cleaned_data.get('examtype')

      # validating the username and password
      if examid >10:
         self._errors['examid'] = self.error_class(['The examid need to between 0 and 1000'])

      if len(examtype) >9:
         self._errors['examtype'] = self.error_class(['The examtype need character length between 9 to 10'])
      return self.cleaned_data
         

        
 
