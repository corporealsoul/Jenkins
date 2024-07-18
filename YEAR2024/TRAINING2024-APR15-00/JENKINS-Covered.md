### -- Add a Node

anup@automation-and-continuous-delivery:~$ sudo apt install fontconfig openjdk-17-jre
anup@automation-and-continuous-delivery:~$ sudo visudo

root    ALL=(ALL:ALL) ALL
anup    ALL=(ALL:ALL) NOPASSWD:ALL
jenkins ALL=(ALL:ALL) NOPASSWD:ALL

anup@automation-and-continuous-delivery:~$ mkdir jenkins
anup@automation-and-continuous-delivery:~$ chmod 755 jenkins/
anup@automation-and-continuous-delivery:~$ cd jenkins/