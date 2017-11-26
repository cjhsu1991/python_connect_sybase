# python_connect_sybase
# step 1 
pip install jaydebeapi3
# step 2 test code
import jaydebeapi
server="10.63.7.6"
database="cp_inventory"
user="cp_inv"
password="taisweet"

jclassname='com.sybase.jdbc3.jdbc.SybDriver'
url='jdbc:sybase:Tds:10.63.7.6:5000/cp_inventory'
driver_args=[url,user,password]
jars="D:/jconn3.jar"

conn=jaydebeapi.connect(jclassname,driver_args,jars)
curs = conn.cursor()
curs.execute("select * from TEMPREP_MA124")
row = curs.fetchall()
while row is not None:
  print(row)
