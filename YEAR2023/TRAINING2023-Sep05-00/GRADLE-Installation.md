https://gradle.org/install/

[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo mkdir /opt/gradle
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo unzip -d /opt/gradle gradle-8.6-bin.zip
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ ls -ltr /opt/gradle/

[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ sudo nano ~/.bashrc
# GRADLE_HOME
export GRADLE_HOME=/opt/gradle/gradle-8.6
export PATH="$PATH:$GRADLE_HOME/bin"

[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ source ~/.bashrc
[anup@automation-and-continuous-delivery TRAINING2023-Sep05-00]$ gradle -v
