from django.db import models

# Create your models here.
class StudentModel(models.Model):
     sno=models.IntegerField()
     sname=models.CharField(max_length=50)
     age=models.IntegerField(default=18)
     def __str__(self):
          return self.sname
class CourseModel(models.Model):
     cno=models.IntegerField()
     cname=models.CharField(max_length=10)
     def __str__(self):
          return self.cname
     
class EnrollModel(models.Model):
     sno=models.ForeignKey(StudentModel,on_delete=models.CASCADE)
     cno=models.ForeignKey(CourseModel,on_delete=models.CASCADE)
     jdate=models.DateTimeField()
     def __str__self():
          return str(self.sno)+'_'+str(self.cno)
     
     
