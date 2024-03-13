### Getting Started

http://192.168.56.8:8080/

[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo cat /var/lib/jenkins/secrets/initialAdminPassword
3578358a7a9741018d4d3370fc320289


Username : corporealsoul
Password : ?19l7P-3dj\G"
E-mail address : uniqs.anup@gmail.com


### Run a Shell command as Root
[anup@automation-and-continuous-delivery bin]$ sudo visudo
jenkins ALL=(ALL)       NOPASSWD:ALL

Command,
sudo /home/anup/Jenkins/YEAR2023/TRAINING2023-Sep05-00/tomcat-9/bin/shutdown.sh
sudo /home/anup/Jenkins/YEAR2023/TRAINING2023-Sep05-00/tomcat-9/bin/startup.sh