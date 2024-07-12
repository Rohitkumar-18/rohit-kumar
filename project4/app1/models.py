from django.db import models

# Create your models here.
class Department(models.Model):
    dname=models.CharField(max_length=50)
    code=models.CharField(max_length=5)
    def __str__(self):
        return self.dname
class Employee(models.Model):
    name= models.CharField(max_length=70)
    address= models.CharField(max_length=90)
    dname= models.ForeignKey(Department, on_delete=models.CASCADE)
    def __str__(self):
        return self.name
    
class School(models.Model):
    name=models.CharField(max_length=20)
    total_population=models.IntegerField(default=200)
    is_private=models.BooleanField(default=False)
    def __str__(self):
        return self.name
class Product(models.Model):
    name= models.CharField(max_length=55)
    description = models.TextField()
    price= models.DecimalField(max_digits=10, decimal_places=2)
    def __str__(self):
        return self.name
    
