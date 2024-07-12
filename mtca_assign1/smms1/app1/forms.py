from django import forms
from .models import BatchMaster
from .models import CourseMaster
from .models import ExamMaster
from .models import PaperMaster
from .models import SemMaster
from .models import StudentMaster
from .models import StudentInternalTrans
class BatchForm(forms.ModelForm):
    class Meta:
        model=BatchMaster
        fields='__all__'
class CourseForm(forms.ModelForm):
    class Meta:
        model=CourseMaster
        fields='__all__'
class ExamForm(forms.ModelForm):
    class Meta:
        model=ExamMaster
        fields='__all__'
class PaperForm(forms.ModelForm):
    class Meta:
        model=PaperMaster
        fields='__all__'
class SemForm(forms.ModelForm):
    class Meta:
        model=SemMaster
        fields='__all__'
class StudentForm(forms.ModelForm):
    class Meta:
        model=StudentMaster
        fields='__all__'
class StudentInternalTransForm(forms.ModelForm):
    class Meta:
        model=StudentInternalTrans
        fields='__all__'

        
        
        
