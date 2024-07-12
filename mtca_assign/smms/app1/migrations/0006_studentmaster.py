# Generated by Django 5.0.6 on 2024-07-05 09:26

import django.db.models.deletion
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('app1', '0005_exammaster'),
    ]

    operations = [
        migrations.CreateModel(
            name='StudentMaster',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('stuRegNo', models.IntegerField()),
                ('studName', models.CharField(max_length=25)),
                ('batchNo', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='app1.batchmaster')),
                ('course', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='app1.coursemaster')),
                ('sem', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='app1.semmaster')),
            ],
        ),
    ]