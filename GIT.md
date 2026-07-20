## **🌿 Git Branching & Development Strategy**

To maintain a clean repository and ensure seamless modular expansion later, we will follow a strict, lightweight Git Flow strategy.

* **`master` (or `main`):** Production-ready code. Only stable, fully tested MVP releases are merged here.  
* **`develop`:** The main integration branch. All feature branches branch off from here and merge back into here via Pull Requests (PRs).  
* **`feature/*` (e.g., `feature/ui-design-system`, `feature/litert-integration`):** Isolated branches for specific tasks.  
* **PR Rules:** No direct pushes to `develop` or `master`. Every feature requires a clean PR with an architectural overview, a screen recording (if UI related), and code verification.  
  * 