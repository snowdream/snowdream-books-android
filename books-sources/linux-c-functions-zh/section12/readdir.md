

readdir（读取目录）
相关函数
open，opendir，closedir，rewinddir，seekdir，telldir，scandir
表头文件
#include<sys/types.h>
#include<dirent.h>
定义函数
struct dirent * readdir(DIR * dir);
函数说明
readdir()返回参数dir目录流的下个目录进入点。
结构dirent定义如下
struct dirent
{
ino_t d_ino;
ff_t d_off;
signed short int d_reclen;
unsigned char d_type;
har d_name[256;
};
d_ino 此目录进入点的inode
d_off 目录文件开头至此目录进入点的位移
d_reclen _name的长度，不包含NULL字符
d_type d_name 所指的文件类型
d_name 文件名
返回值
成功则返回下个目录进入点。有错误发生或读取到目录文件尾则返回NULL。
附加说明
EBADF参数dir为无效的目录流。
范例
#include<sys/types.h>
#include<dirent.h>
#include<unistd.h>
main()
{
DIR * dir;
struct dirent * ptr;
int i;
dir =opendir(“/etc/rc.d”);
while((ptr = readdir(dir))!=NULL)
{
printf(“d_name: %s\n”,ptr->d_name);
}
closedir(dir);
}
执行
d_name:.
d_name:..
d_name:init.d
d_name:rc0.d
d_name:rc1.d
d_name:rc2.d
d_name:rc3.d
d_name:rc4.d
d_name:rc5.d
d_name:rc6.d
d_name:rc
d_name:rc.local
d_name:rc.sysinit