import jaydebeapi
server="ip位置"
database="資料庫名稱"
user="資料庫帳號"
password="資料庫密碼"

jclassname='com.sybase.jdbc3.jdbc.SybDriver'
url='jdbc:sybase:Tds:IP位置:5000/資料庫名稱'
driver_args=[url,user,password]
jars="/home/jconn3.jar"  #放置JAR的路徑要記得加到CLASSPATH    
conn=jaydebeapi.connect(jclassname,driver_args,jars)

curs = conn.cursor()

curs.execute("select * from TEMPREP_MA124")

row = curs.fetchall()

while row is not None:
  print(row)
