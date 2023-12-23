document.addEventListener("DOMContentLoaded", () => {
    var mobileMenuIconEl = document.getElementById("mobile-menu-icon");
    var mobileMenuEl = document.getElementById("mobile-menu-outter");

    mobileMenuIconEl.addEventListener("click", () => {
        mobileMenuEl.style.display = "block";
    });

    document.addEventListener("click", (event) => {
        if (event.target != mobileMenuIconEl) {
            mobileMenuEl.style.display = "none";
        }  
    });
});
