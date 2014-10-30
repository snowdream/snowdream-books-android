iscntrl（测试字符是否为ASCII 码的控制字符）
相关函数
isascii
表头文件
#include <ctype.h>
定义函数
int iscntrl(int c)；
函数说明
检查参数c是否为ASCII控制码，也就是判断c的范围是否在0到30之间。
返回值
若参数c为ASCII控制码，则返回TRUE，否则返回NULL(0)。
附加说明
此为宏定义，非真正函数。