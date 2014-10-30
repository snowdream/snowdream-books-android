

utimes（修改文件的存取时间和更改时间）
相关函数
utime，stat
表头文件
#include<sys/types.h>
#include<utime.h>
定义函数
int utimes(char * filename.struct timeval *tvp);
函数说明
utimes()用来修改参数filename文件所属的inode存取时间和修改时间。
结构timeval定义如下
struct timeval {
long tv_sec;
long tv_usec; /* 微妙*/
};
返回值
参数tvp 指向两个timeval 结构空间，和utime（）使用的utimebuf结构比较，tvp[0].tc_sec 则为utimbuf.actime，tvp]1].tv_sec 为utimbuf.modtime。
执行成功则返回0。失败返回-1，错误代码存于errno。
错误代码
EACCESS 存取文件时被拒绝，权限不足
ENOENT 指定的文件不存在