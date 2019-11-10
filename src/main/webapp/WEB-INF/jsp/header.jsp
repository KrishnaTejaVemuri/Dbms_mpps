<div class="site-mobile-menu site-navbar-target">
    <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close mt-3">
            <span class="icon-close2 js-menu-toggle"></span>
        </div>
    </div>
    <div class="site-mobile-menu-body"></div>
</div>

<header class="site-navbar site-navbar-target" role="banner">

    <div class="container mb-3">
        <div class="d-flex align-items-center">
            <div class="site-logo mr-auto">
                <a href="/">MANDAL PARISHAT PRIMARY SCHOOL<span class="text-primary">.</span></a>
            </div>
            <div class="site-quick-contact d-none d-lg-flex ml-auto ">
                
            </div>
        </div>
    </div>


    <div class="container">
        <div class="menu-wrap d-flex align-items-center">
            <span class="d-inline-block d-lg-none"><a href="#"
                    class="text-black site-menu-toggle js-menu-toggle py-5"><span
                        class="icon-menu h3 text-black"></span></a></span>



            <nav class="site-navigation text-left mr-auto d-none d-lg-block" role="navigation">
                <ul class="site-menu main-menu js-clone-nav mr-auto ">
                    <li class="active"><a href="/" class="nav-link">Home</a></li>
                    <!-- <li><a href="/authorityvisit/list"> Authority Visits</a></li><li><a href="/Cashssa/list"> Cashssa</a> -->
                    </li>
                    <li><a href="/Mppsstudent/list"> Students</a></li>
                    <li><a href="/Mppsteacher/list"> Teachers</a></li>
                    <li><a href="/Mppsstaff/list"> Staff</a></li>
                    <li><a href="/Middaymeals/list"> Middaymeals</a></li>                   
                </ul>
            </nav>

            <div class="top-social ml-auto">
                <sec:authorize access="isAuthenticated()"> 
                    
                    <a href="/logout">Logout</a>
                </sec:authorize>
            </div>
        </div>
    </div>



</header>