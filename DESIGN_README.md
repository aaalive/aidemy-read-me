{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 ---\
name: Playful Discovery\
colors:\
  surface: '#f7f9ff'\
  surface-dim: '#d8dadf'\
  surface-bright: '#f7f9ff'\
  surface-container-lowest: '#ffffff'\
  surface-container-low: '#f1f4f9'\
  surface-container: '#eceef3'\
  surface-container-high: '#e6e8ed'\
  surface-container-highest: '#e0e2e8'\
  on-surface: '#181c20'\
  on-surface-variant: '#404850'\
  inverse-surface: '#2d3135'\
  inverse-on-surface: '#eff1f6'\
  outline: '#707881'\
  outline-variant: '#c0c7d1'\
  surface-tint: '#006398'\
  primary: '#006398'\
  on-primary: '#ffffff'\
  primary-container: '#5ca9e6'\
  on-primary-container: '#003c5f'\
  inverse-primary: '#93ccff'\
  secondary: '#705d00'\
  on-secondary: '#ffffff'\
  secondary-container: '#fdd73b'\
  on-secondary-container: '#715d00'\
  tertiary: '#006e29'\
  on-tertiary: '#ffffff'\
  tertiary-container: '#56b665'\
  on-tertiary-container: '#004316'\
  error: '#ba1a1a'\
  on-error: '#ffffff'\
  error-container: '#ffdad6'\
  on-error-container: '#93000a'\
  primary-fixed: '#cde5ff'\
  primary-fixed-dim: '#93ccff'\
  on-primary-fixed: '#001d32'\
  on-primary-fixed-variant: '#004b74'\
  secondary-fixed: '#ffe173'\
  secondary-fixed-dim: '#e8c426'\
  on-secondary-fixed: '#221b00'\
  on-secondary-fixed-variant: '#554500'\
  tertiary-fixed: '#96f89f'\
  tertiary-fixed-dim: '#7bdb85'\
  on-tertiary-fixed: '#002107'\
  on-tertiary-fixed-variant: '#00531d'\
  background: '#f7f9ff'\
  on-background: '#181c20'\
  surface-variant: '#e0e2e8'\
typography:\
  headline-lg:\
    fontFamily: Quicksand\
    fontSize: 40px\
    fontWeight: '700'\
    lineHeight: 48px\
    letterSpacing: -0.02em\
  headline-lg-mobile:\
    fontFamily: Quicksand\
    fontSize: 32px\
    fontWeight: '700'\
    lineHeight: 38px\
    letterSpacing: -0.01em\
  headline-md:\
    fontFamily: Quicksand\
    fontSize: 28px\
    fontWeight: '700'\
    lineHeight: 34px\
  body-lg:\
    fontFamily: Quicksand\
    fontSize: 22px\
    fontWeight: '500'\
    lineHeight: 32px\
  body-md:\
    fontFamily: Quicksand\
    fontSize: 18px\
    fontWeight: '500'\
    lineHeight: 28px\
  label-lg:\
    fontFamily: Quicksand\
    fontSize: 16px\
    fontWeight: '700'\
    lineHeight: 20px\
  label-sm:\
    fontFamily: Quicksand\
    fontSize: 14px\
    fontWeight: '600'\
    lineHeight: 18px\
rounded:\
  sm: 0.5rem\
  DEFAULT: 1rem\
  md: 1.5rem\
  lg: 2rem\
  xl: 3rem\
  full: 9999px\
spacing:\
  base: 8px\
  xs: 4px\
  sm: 12px\
  md: 24px\
  lg: 40px\
  xl: 64px\
  gutter: 20px\
  margin: 24px\
---\
\
## Brand & Style\
\
The brand personality of the design system is encouraging, safe, and high-energy, specifically tailored for children aged 4-8. It avoids the chaotic visuals often associated with kids' products, instead opting for a **Tactile Minimalism** approach. This style combines clean, generous whitespace with "squishy," touchable UI elements that respond to interaction with physical-like feedback.\
\
The aesthetic goal is to make the interface feel like a digital playroom\'97structured enough to navigate independently, but soft enough to feel inviting. We use a combination of vibrant, soft-edged geometry and subtle 3D depth to guide the eye toward interactive elements, ensuring the cognitive load remains low for early learners.\
\
## Colors\
\
The palette is built on a foundation of "Vibrant Pastels"\'97colors that have enough saturation to feel exciting but are softened to prevent eye strain during learning sessions. \
\
- **Primary (Gentle Blue):** Used for main navigation and primary actions. It represents trust and calm.\
- **Secondary (Sunny Yellow):** Used for rewards, achievements, and highlights. It evokes happiness.\
- **Tertiary (Leaf Green):** Reserved for "correct" states and progress-related feedback.\
- **Quaternary (Friendly Orange):** Used for attention-grabbing elements and secondary interactions.\
- **Background (Off-White):** A warm, cream-tinted white reduces the harsh contrast of pure white, making the experience feel more like a physical book or toy.\
\
## Typography\
\
This design system utilizes **Quicksand** exclusively to ensure a friendly, rounded terminal across all text roles. Because the target audience includes early readers, font sizes are significantly larger than standard applications to improve legibility and tap-target association.\
\
Headlines use a "Heavy" weight to create a clear hierarchy against the softer background. Body text maintains a medium weight to ensure that the rounded strokes of the letterforms remain distinct and readable. Tracking is slightly loosened for body text to assist children who are still learning to differentiate between characters.\
\
## Layout & Spacing\
\
The layout philosophy follows a **Fixed Grid with Safe Zones**. To prevent the interface from feeling overwhelming, we use a generous 8px base scaling unit, often skipping steps (e.g., jumping from 24px to 40px) to create clear "islands" of content.\
\
- **Mobile:** 4-column layout with 24px side margins. Elements are mostly full-width to maximize the tap area.\
- **Tablet/Desktop:** 12-column fixed grid with a max-width of 1024px. Content remains centered to keep the child's focus within a manageable field of vision.\
- **Vertical Rhythm:** Large vertical gaps (40px+) are used between different learning modules to signify a change in activity.\
\
## Elevation & Depth\
\
Rather than traditional drop shadows that mimic natural light, this design system uses **Tactile Layering**. \
\
Depth is achieved through **Tonal Offsets**. Interactive elements like buttons and cards feature a "bottom-heavy" border\'97a darker shade of the element\'92s color placed at the bottom to simulate a 3D physical block. When pressed, the element translates 2-4px downward, and the bottom border disappears, giving the satisfying feeling of a physical button being pushed into a toy.\
\
Non-interactive containers use a **Soft Tonal Layering** approach, where surfaces are differentiated by subtle shifts in background color rather than shadows.\
\
## Shapes\
\
The shape language is strictly **Ultra-Rounded**. There are no sharp corners in the design system, reinforcing the "safe" and "friendly" brand pillar. \
\
Containers use a 1.5rem (24px) radius by default, while primary buttons and interactive chips utilize a full **Pill-shape** (100px+ radius). This high degree of roundedness makes the UI feel organic and toy-like, inviting touch and exploration.\
\
## Components\
\
### Buttons\
Primary buttons must be chunky. They consist of a surface color and a 4px-8px bottom "depth" layer of a darker shade. Icons inside buttons should be centered and utilize a thicker stroke (2.5px+) to match the font weight.\
\
### Interactive Cards\
Cards are the primary vessel for learning content. They should have a thick 2px colored border and a subtle "squishy" press state. Large cards often feature a top-heavy layout with an illustration followed by a short headline.\
\
### Progress Bars\
The track is a soft, low-opacity version of the progress color. The "fill" is a vibrant green or blue. A "cute marker" (a star, a smiley, or a character icon) sits at the leading edge of the progress fill to act as a visual motivator.\
\
### Input Fields & Selection\
Checkboxes and Radio buttons are replaced by large, selectable "Action Tiles." When a child selects an option, the tile should highlight with a thick border and a "bounce" animation to confirm the choice.\
\
### Simple Icons\
Icons should be "Filled" style with rounded caps. Avoid complex details; use simple, recognizable metaphors that children can understand without needing to read accompanying text.}