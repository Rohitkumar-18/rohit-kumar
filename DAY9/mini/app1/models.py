from django.db import models

# Create your models here.
class ExamMaster(models.Model):
    examid=models.IntegerField()
    examtype=models.CharField(max_length=15)
    def __str__(self):
        return str(self.examtype)
    


 

