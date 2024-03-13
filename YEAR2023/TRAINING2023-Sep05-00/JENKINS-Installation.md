anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo wget -O /etc/yum.repos.d/jenkins.repo \
    https://pkg.jenkins.io/redhat-stable/jenkins.repo
anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io-2023.key
anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo yum upgrade
anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo yum install fontconfig
anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo yum install jenkins

[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo systemctl enable jenkins
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo systemctl start jenkins
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo systemctl status jenkins

[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo firewall-cmd --permanent --add-port=8080/tcp
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo firewall-cmd --reload

