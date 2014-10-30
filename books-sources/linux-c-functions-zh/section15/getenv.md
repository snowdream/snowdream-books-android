getenv（取得环境变量内容）
<pre>相关函数
putenv，setenv，unsetenv
表头文件
#include< stdlib.h>
定义函数
char * getenv(const char *name);
函数说明
getenv()用来取得参数name环境变量的内容。参数name为环境变量的名称，如果该变量存在则会返回指向该内容的指针。环境变量的格式为name＝value。
返回值
执行成功则返回指向该内容的指针，找不到符合的环境变量名称则返回NULL。
范例
#include< stdlib.h>
mian()
{
char *p;
if((p = getenv(“USER”)))
printf(“USER=%s\n”,p);
}
执行
USER = root</pre>