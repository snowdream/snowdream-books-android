strcoll（采用目前区域的字符排列次序来比较字符串）
相关函数
strcmp，bcmp，memcmp，strcasecmp，strncasecmp
表头文件
#include<string.h>
定义函数
int strcoll( const char *s1, const char *s2);
函数说明
strcoll()会依环境变量LC_COLLATE所指定的文字排列次序来比较s1和s2 字符串。
返回值
若参数s1和s2字符串相同则返回0。s1若大于s2则返回大于0的值。s1若小于s2则返回小于0 的值。
附加说明
若LC_COLLATE为"POSIX"或"C"，则strcoll()与strcmp()作用完全相同。
范例
参考strcmp()。