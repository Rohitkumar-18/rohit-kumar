# Generated by Django 5.0.6 on 2024-07-05 09:31

import django.db.models.deletion
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('app1', '0006_studentmaster'),
    ]

    operations = [
        migrations.CreateModel(
            name='StudentInternalTrans',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nameoftheStudent', models.CharField(max_length=25)),
                ('batch', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='app1.batchmaster')),
                ('course', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='app1.coursemaster')),
                ('examType', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='app1.exammaster')),
                ('paperCode', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='app1.papermaster')),
                ('sem', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='app1.semmaster')),
                ('stuRegNo', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='app1.studentmaster')),
            ],
        ),
    ]
