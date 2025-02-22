from django.db import models

# Create your models here.
class Post(models.Model):
    title=models.CharField(max_length=255)
    slug=models.SlugField(unique=True,max_length=255)
    content=models.TextField()
    created_on=models.DateTimeField(auto_now_add=True)
    author=models.TextField()
    

class Comment(models.Model):
    name=models.CharField(max_length=42)
    email=models.EmailField(max_length=75)
    website=models.URLField(max_length=200,null=True,blank=True)
    content=models.TextField()
    post=models.ForeignKey(Post,on_delete=models.CASCADE)
    created_on=models.DateTimeField(auto_now_add=True)

        
