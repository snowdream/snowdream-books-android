closedir（关闭目录）
<pre>相关函数
opendir
表头文件
#include< sys/types.h>
#include< dirent.h>
定义函数
int closedir(DIR *dir);
函数说明
closedir()关闭参数dir所指的目录流。
返回值
关闭成功则返回0，失败返回-1，错误原因存于errno 中。
错误代码
EBADF 参数dir为无效的目录流
范例
参考readir()。</pre>