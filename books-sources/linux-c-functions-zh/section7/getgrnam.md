getgrnam（从组文件中取得指定组的数据）
相关函数
fgetgrent，getrent，getgruid
表头文件
#include<grp.h>
#include<sys/types.h>
定义函数
strcut group * getgrnam(const char * name);
函数说明
getgrnam（）用来逐一搜索参数那么指定的组名称，找到时便将该组的数据以group结构返回。group 结构请参考getgrent（）。
返回值
返回group结构数据，如果返回NULL则表示已无数据，或有错误发生。
范例
/* 取得adm的组数据*/
#include<grp.h>
#include<sys/types.h>
main()
{
strcut group * data;
int i=0;
data = getgrnam(“adm”);
printf(“%s:%s:%d:”,data->gr_name,data->gr_passwd,data->gr_gid);
while(data->gr_mem[i])printf(“%s,”,data->gr_mem[i++]);
printf(“\n”);
}
执行
adm:x:4:root,adm,daemon