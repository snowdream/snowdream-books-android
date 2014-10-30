getgrgid（从组文件中取得指定gid 的数据）
<pre>相关函数
fgetgrent，getgrent，getgrnam
表头文件
#include< grp.h>
#include< sys/types.h>
定义函数
strcut group * getgrgid(gid_t gid);
函数说明
getgrgid（）用来依参数gid指定的组识别码逐一搜索组文件，找到时便将该组的数据以group结构返回。group结构请参考getgrent（）。
返回值
返回group结构数据，如果返回NULL则表示已无数据，或有错误发生。
范例
/* 取得gid＝3的组数据*/
#include< grp.h>
#include< sys/types.h>
main()
{
strcut group *data;
int i=0;
data = getgrgid(3);
printf(“%s:%s:%d:”,data->gr_name,data->gr_passwd,data->gr_gid);
while(data->gr_mem[i])printf(“%s ,”,data->mem[i++]);
printf(“\n”);
}
执行
sys:x:3:root,bin,adm</pre>