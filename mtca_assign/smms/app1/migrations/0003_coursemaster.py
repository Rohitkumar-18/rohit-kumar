# Generated by Django 5.0.6 on 2024-07-05 09:19

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('app1', '0002_papermaster_alter_batchmaster_batchno'),
    ]

    operations = [
        migrations.CreateModel(
            name='CourseMaster',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('course', models.CharField(max_length=4)),
                ('courseId', models.IntegerField()),
            ],
        ),
    ]
