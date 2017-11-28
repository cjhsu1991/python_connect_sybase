# 測試 在ubuntu中透過python 連接sybase

#Step1 在 Ubuntu 中安裝 JAVA

 sudo add-apt-repository ppa:webupd8team/java

 sudo apt-get update

 sudo apt-get install oracle-java8-installer

#Step2 確認 JAVA 是否安裝成功 及 確認 JAVA 版本

 java -version

#如果安裝成功 應該會看到 

 #java version "1.8.0_151"

 #Java(TM) SE Runtime Environment (build 1.8.0_151-b12)

 #Java HotSpot(TM) 64-Bit Server VM (build 25.151-b12, mixed mode)

#Step3 設定 JAVA Environment

 sudo apt-get install oracle-java8-set-default

#Step4 設定 JAVA PATH AND CLASSPATH

 sudo nano /etc/profile

 #在該檔案的最後加上 java的安裝路徑 path and CLASSPATH

 export JAVA_HOME=/usr/lib/jvm/java-8-oracle    

 export PATH=$JAVA_HOME/bin:$PATH

 export CLASSPATH=$CLASSPATH:/home/jdbc3.jar

 #↑ CLASSPATH 是設定等等PYTHON會用到的jar 看會用到的jar放哪裡路徑就怎麼設定

#Step5 儲存 /etc/profile 並重新載入

 source /etc/profile

#Step6

 重新啟動機器
 
 ----------------------------------------------------------------------------
 # 測試 PYTHON 程式
 pip install jaydebeapi3
 在ubuntu 的 python環境中 執行資料夾的 test.py 程式 確認是否可以順利連線

