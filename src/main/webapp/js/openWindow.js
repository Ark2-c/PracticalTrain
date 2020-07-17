function OpenWindow(url,w,h)
            {
                var left=Math.round((window.screen.availWidth-w)/2);
                var top=Math.round((window.screen.availHeight-100-h)/2);
                var MyWin=window.open(url, "", "height="+h+", width="+w+",top="+top+",left="+left+", toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no");
            }