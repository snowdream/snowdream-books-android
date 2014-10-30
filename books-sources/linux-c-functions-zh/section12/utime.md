utime（修改文件的存取时间和更改时间）
<pre>相关函数
utimes，stat
表头文件
#include< sys/types.h>
#include< utime.h>
定义函数
int utime(const char * filename,struct utimbuf * buf);
函数说明
utime()用来修改参数filename文件所属的inode存取时间。
结构utimbuf定义如下
struct utimbuf{
time_t actime;
time_t modtime;
};
返回值
如果参数buf为空指针(NULL)，则该文件的存取时间和更改时间全部会设为目前时间。
执行成功则返回0，失败返回-1，错误代码存于errno。
错误代码
EACCESS 存取文件时被拒绝，权限不足
ENOENT 指定的文件不存在。</pre>