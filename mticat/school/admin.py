from django.contrib import admin
from.models import StudentModel
from.models import CourseModel
from.models import EnrollModel
# Register your models here.
admin.site.register(StudentModel)
admin.site.register(CourseModel)
admin.site.register(EnrollModel)

