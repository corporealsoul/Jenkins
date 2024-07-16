### -- BACKUP with Thinbackup
Thin Backup , http://192.168.56.102:8080/manage/configure

Backup directory - /var/lib/jenkins/backup
Backup schedule for full backups - H * * * *
Backup schedule for differential backups - H * * * *
Max number of backup sets - 1


### -- Master Slave Configuration
Each slaves should have below configuarations,
[anup@infrastructure-management-and-provisioning ~]$ sudo yum install fontconfig java-17-openjdk

