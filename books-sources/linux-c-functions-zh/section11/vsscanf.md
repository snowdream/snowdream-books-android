vsscanf（格式化字符串输入）
相关函数
vscanf，vfscanf
表头文件
#include<stdio.h>
定义函数
int vsscanf(const char * str,const char * format,va_list ap);
函数说明
vsscanf()会将参数str的字符串根据参数format字符串来转换并格式化数据。格式转换形式请参考附录C 或vprintf()范例。
返回值
成功则返回参数数目，失败则返回-1，错误原因存于errno中。
范例
请参考sscanf()及vprintf()。