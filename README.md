PkApplyLauncher
===============

A tool wrapper to make supporting launchers much simpler and organized. This mini "library" was developed to keep code as clean as possible while making perfect sense of it.

Download
--------

Download [the latest JAR][1] or grab via Maven:

// TODO

Usage & Integration
--------

Usage is very simple. Everything is static so there's no special instance needed. 
This wrapper uses "Launcher Objects" to function properly. You can use a list of these objects to populate your layout list if you wish.

To retrieve an list of all supported launchers...
```java
PkApplyLauncher.getLauncherList();
```

To get a specific launcher object...
```java
PkApplyLauncher.getNovaLauncher();
```

To apply a launcher...
```java
PkApplyLauncher.apply(novaLauncher, this);
```

To add support for a custom launcher...
```java
Launcher customLauncher = new Launcher();
customLauncher.setName("My Awesome Launcher");
customLauncher.setPackage("launcher.package.name");
// Etc
```

To add your custom launcher to the list of launchers...
```java
launcherList.add(customLauncher);
```

To remove a launcher from the list...
```java
launcherList.remove(APEX);
```

To set custom values to a launcher object for your own usage...
```java
actionLauncher.putExtra("Icon", R.drawable.launcher_action);
actionLauncher.putExtra("Installed", true);
actionLauncher.putExtra("Description", "Chris Lacy is awesome!");
```

Easy, right? :D

Developed By
--------

Pkmmte Xeleon - www.pkmmte.com

<a href='https://pledgie.com/campaigns/25009'>
  <img alt='Click here to lend your support to: PkRequestManager and make a donation at pledgie.com !'         		       src='https://pledgie.com/campaigns/25009.png?skin_name=chrome' border='0' >
</a>

<a href="https://plus.google.com/102226057091361048952">
  <img alt="Follow me on Google+"
       src="http://data.pkmmte.com/temp/social_google_plus_logo.png" />
</a>
<a href="https://www.linkedin.com/pub/pkmmte-xeleon/7a/409/b4b/">
  <img alt="Follow me on LinkedIn"
       src="http://data.pkmmte.com/temp/social_linkedin_logo.png" />
</a>

License
--------

    The MIT License (MIT)
    
    Copyright (c) 2014 Pkmmte Xeleon
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.

 [1]: https://github.com/Pkmmte/PkApplyLauncher/releases/download/v1.0/pkapplylauncher-1.0.jar
