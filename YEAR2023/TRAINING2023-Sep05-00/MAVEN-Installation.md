[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo dnf update
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo dnf install maven
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ mvn -version
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ readlink -f $(which mvn)
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo nano ~/.bashrc
# M2_HOME
export M2_HOME=/usr/share/maven  
export PATH="$PATH:$M2_HOME/bin"

[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ source ~/.bashrc
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ echo $M2_HOME
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ echo $PATH
















