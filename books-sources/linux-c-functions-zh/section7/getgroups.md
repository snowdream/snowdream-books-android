getgroups（取得组代码）
相关函数
initgroups，setgroup，getgid，setgid
表头文件
#include<unistd.h>
#include<sys/types.h>
定义函数
int getgroups(int size,gid_t list[]);
函数说明
getgroup（）用来取得目前用户所属的组代码。参数size为list〔〕所能容纳的gid_t 数目。如果参数size 值为零，此函数仅会返回用户所属的组数。
返回值
返回组识别码，如有错误则返回-1。
错误代码
EFAULT 参数list数组地址不合法。EINVAL 参数size值不足以容纳所有的组。
范例
#include<unistd.h>
#include<sys/types.h>
main()
{
gid_t list[500];
int x,i;
x = getgroups(0.list);
getgroups(x,list);
for(i=0;i<x;i++)
printf(“%d:%d\n”,i,list[i]);
}
执行
0:00
1:01
2:02
3:03
4:04
5:06
6:10