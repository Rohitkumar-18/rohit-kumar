from django.db import models

# Create your models here.
class School(models.Model):
    name=models.CharField(max_length=20)
    total_population=models.IntegerField(default=200)
    is_private=models.BooleanField(default=False)
    def __str__(self):
        return self.name
