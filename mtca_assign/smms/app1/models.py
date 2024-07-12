from django.db import models

# Create your models here.
class BatchMaster(models.Model):
    batchNo=models.IntegerField()
    batchId=models.CharField(max_length=8)
    def __str__(self):
        return self.batchId
class PaperMaster(models.Model):
    paperCode=models.CharField(max_length=8)
    paperType=models.CharField(max_length=15)
    papershtName=models.CharField(max_length=10)
    paperName=models.CharField(max_length=24)
    def __str__(self):
        return self.paperCode
    
class CourseMaster(models.Model):
    course=models.CharField(max_length=4)
    courseId=models.IntegerField()
    def __str__(self):
        return self.course
class SemMaster(models.Model):
    sem=models.CharField(max_length=3)
    semId=models.IntegerField()
    def __str__(self):
        return self.sem
class ExamMaster(models.Model):
    examId=models.IntegerField()
    examType=models.CharField(max_length=10)
    def __str__(self):
        return self.examType

class StudentMaster(models.Model):
    batchNo=models.ForeignKey(BatchMaster,on_delete=models.CASCADE)
    sem=models.ForeignKey(SemMaster,on_delete=models.CASCADE)
    course=models.ForeignKey(CourseMaster,on_delete=models.CASCADE)
    stuRegNo=models.IntegerField()
    studName=models.CharField(max_length=25)
 

class StudentInternalTrans(models.Model):
    course=models.ForeignKey(CourseMaster,on_delete=models.CASCADE)
    batch=models.ForeignKey(BatchMaster,on_delete=models.CASCADE)
    sem=models.ForeignKey(SemMaster,on_delete=models.CASCADE)
    examType=models.ForeignKey(ExamMaster,on_delete=models.CASCADE)
    stuRegNo=models.ForeignKey(StudentMaster,on_delete=models.CASCADE)
    nameoftheStudent=models.CharField(max_length=25)
    paperCode=models.ForeignKey(PaperMaster,on_delete=models.CASCADE)
    def __str__(self):
        return self.nameoftheStudent
