### 1. BACKUP with Thinbackup
Thin Backup , http://192.168.56.102:8080/manage/configure

Backup directory - /var/lib/jenkins/backup
Backup schedule for full backups - H * * * *
Backup schedule for differential backups - H * * * *
Max number of backup sets - 1


### 2. Master Slave Configuration
Each slaves should have below configuarations,

anup@automation-and-continuous-delivery:~$ sudo apt install fontconfig openjdk-17-jre
anup@automation-and-continuous-delivery:~$ sudo visudo

root    ALL=(ALL:ALL) ALL
anup    ALL=(ALL:ALL) NOPASSWD:ALL
jenkins ALL=(ALL:ALL) NOPASSWD:ALL

anup@automation-and-continuous-delivery:~$ mkdir jenkins
anup@automation-and-continuous-delivery:~$ chmod 755 jenkins/
anup@automation-and-continuous-delivery:~$ cd jenkins/


### -- Tools in Jenkins


### -- Freestyle project


### -- Tools in Jenkins


### -- Pipeline


### -- Security analysis


