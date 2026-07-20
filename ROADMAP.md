## **🗺️ Step-by-Step Implementation Roadmap: "Reading Adventure" MVP**

### **Step 1: Repository Setup & Multi-Module Architecture**

* **Goal:** Create a rock-solid, compile-ready KMP foundation.  
* **Tasks:**  
  * Initialize a new KMP project utilizing **Compose Multiplatform** for shared UI.  
  * Structure the project into distinct, decoupled modules:  
    * :core:designsystem (Colors, typography, shared atomic UI elements).  
    * :core:database (Local storage for profiles and progress).  
    * :feature:onboarding (User profile creation).  
    * :feature:reading-engine (AI logic, audio tracking, and adventure map UI).  
  * **Git Strategy:** Branch feature/project-handshake \-\>Merge to develop.

### **Step 2: The Shared Design System Module (:core:designsystem)**

* **Goal:** Build the visual theme based strictly on the design specs, entirely isolated for later reuse.  
* **Tasks:**  
  * Define the design tokens: Theme color palettes (Primary Blues, Secondary Accents, Yellow highlight buttons).  
  * Implement the custom typography configurations optimized for children's reading accessibility (clean sans-serif fonts, precise letter-spacing).  
  * Build reusable atomic Compose components: The primary action buttons, custom text input fields, and custom progress indicators.  
  * **Git Strategy:** Branch feature/design-system \-\>Merge to develop.

### **Step 3: Onboarding & Local Storage Integration**

* **Goal:** Build the profile setup flow and save child data locally with $0 server costs.  
* **Tasks:**  
  * Implement the Onboarding Screen layout: Name input text field, Age selectors, and Interest toggle buttons (Toys, Sports, Space, Animals, etc.).  
  * Set up a lightweight local key-value store or local database (SQLDelight or Room KMP) to persist the child's profile details securely on-device.  
  * **Git Strategy:** Branch feature/onboarding-profile \-\>Merge to develop.

### **Step 4: Local On-Device AI Pipeline (:core:ml)**

* **Goal:** Initialize the offline text generation engine.  
* **Tasks:**  
  * Integrate the **LiteRT (TensorFlow Lite) LLM Inference SDK** into the shared module.  
  * Set up the project to load the optimized **Gemma-3 1B** .task model directly into mobile device memory (utilizing GPU/NNAPI acceleration where available).  
  * Craft the internal localized system prompt templates. Example:*"You are a reading coach for a \[AGE\]-year-old child named \[NAME\] who loves \[INTERESTS\]. Generate content matching their current tier: Level 1 (Syllables), Level 2 (Short Words), or Level 3 (Short sentences)."*  
  * **Git Strategy:** Branch feature/offline-ai-engine \-\>Merge to develop.

### **Step 5: Voice Practice & Native Speech Interop**

* **Goal:** Listen to the child read and evaluate their accuracy.  
* **Tasks:**  
  * Create an expect/actual interface interface layer for the audio recording engine.  
  * Implement the actual Android implementation utilizing android.speech.SpeechRecognizer.  
  * Implement the actual iOS implementation utilizing the Apple Speech framework.  
  * Write the comparison utility logic: Compare the speech-to-text string array against the target AI-generated words to calculate a matching accuracy percentage.  
  * **Git Strategy:** Branch feature/speech-recognition \-\>Merge to develop.

### **Step 6: Gamification, Adventure Map, and Dopamine Loops**

* **Goal:** Build the visual map progression and celebrate small wins to keep kids highly engaged.  
* **Tasks:**  
  * Build the custom scrolling vertical path UI ("Reading Adventure Map") using interactive nodes representing Letters, Syllables, Short Words, and Full Stories.  
  * Integrate **Lottie Multiplatform** to support rich vector animations.  
  * Program the "Dopamine Peak" triggers: When the voice evaluation returns a successful match, immediately fire off a screen-wide confetti explosion, trigger the RO-BOT character's victory dance animation, increment the persistent Star Counter badge, and trigger subtle haptic feedback.  
  * **Git Strategy:** Branch feature/adventure-gamification \-\>Merge to develop.

### **Step 7: Stabilize, Polish, & Main Release**

* **Goal:** Ensure the app handles edge cases gracefully before final deployment.  
* **Tasks:**  
  * Optimize memory performance during the AI model initialization lifecycle.  
  * Test UI scaling across varying screen formats (tablets vs. compact phones).  
  * Create a stable production build and execute a final merge request.  
  * **Git Strategy:** Final PR develop \-\>Merge to master.