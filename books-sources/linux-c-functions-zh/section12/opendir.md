opendir（打开目录）
<pre>相关函数
open，readdir，closedir，rewinddir，seekdir，telldir，scandir
表头文件
#include< sys/types.h>
#include< dirent.h>
定义函数
DIR * opendir(const char * name);
函数说明
opendir()用来打开参数name指定的目录，并返回DIR*形态的目录流，和open()类似，接下来对目录的读取和搜索都要使用此返回值。
返回值
成功则返回DIR* 型态的目录流，打开失败则返回NULL。
错误代码
EACCESS 权限不足
EMFILE 已达到进程可同时打开的文件数上限。
ENFILE 已达到系统可同时打开的文件数上限。
ENOTDIR 参数name非真正的目录
ENOENT 参数name 指定的目录不存在，或是参数name 为一空字符串。
ENOMEM 核心内存不足。</pre>