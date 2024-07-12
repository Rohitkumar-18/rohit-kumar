from django.contrib import admin
from . models import School
from . models import Product
from . models import Department
from . models import Employee

# Register your models here.
admin.site.register(School)
admin.site.register(Product)
admin.site.register(Department)
admin.site.register(Employee)


