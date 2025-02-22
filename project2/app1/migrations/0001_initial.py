# Generated by Django 5.0.6 on 2024-07-02 05:31

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='School',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=20)),
                ('total_population', models.IntegerField(default=200)),
                ('is_private', models.BooleanField(default=False)),
            ],
        ),
    ]
