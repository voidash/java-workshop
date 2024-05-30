---

# Installing OpenJDK 16 on Windows, Mac, and Linux

## Prerequisites

1. Ensure you have an internet connection.
2. Administrator privileges might be required for some steps.

---

## Installing OpenJDK 16 on Windows


[Freecode camp tutorial on Installing Java multi-os guide](https://www.freecodecamp.org/news/install-openjdk-free-java-multi-os-guide/)


### Step 1: Download the OpenJDK 16 installer

Go to the [AdoptOpenJDK page](https://adoptopenjdk.net/releases.html) or the [OpenJDK 16 official download page](https://jdk.java.net/16/) and download the appropriate installer for your system.

### Step 2: Run the installer

1. Double-click the downloaded `.msi` file.
2. Follow the on-screen instructions to install OpenJDK 16.

### Step 3: Set up the Java environment variables

1. Open the Start Menu, search for "Environment Variables", and select "Edit the system environment variables".
2. In the System Properties window, click on the "Environment Variables" button.
3. Under "System variables", click "New" to add a new variable.
   - Variable name: `JAVA_HOME`
   - Variable value: `C:\Program Files\AdoptOpenJDK\jdk-16.0.x` (replace `jdk-16.0.x` with your actual JDK folder name)
4. Find the `Path` variable under "System variables", select it, and click "Edit".
5. Click "New" and add `%JAVA_HOME%\bin`.
6. Click "OK" to close all windows.

### Step 4: Verify the installation

Open Command Prompt and type:

```cmd
java -version
```

You should see output similar to:

```plaintext
openjdk version "16.0.2" 2021-07-20
OpenJDK Runtime Environment (build 16.0.2+7-67)
OpenJDK 64-Bit Server VM (build 16.0.2+7-67, mixed mode, sharing)
```

---

## Installing OpenJDK 16 on Mac

### Step 1: Install Homebrew (if not already installed)

Homebrew is a package manager for macOS.

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

### Step 2: Use Homebrew to install OpenJDK 16

```bash
brew install openjdk@16
```

### Step 3: Configure the Java environment variables

Add the following to your shell profile (e.g., `~/.zshrc` or `~/.bash_profile`):

```bash
echo 'export PATH="/usr/local/opt/openjdk@16/bin:$PATH"' >> ~/.zshrc
echo 'export CPPFLAGS="-I/usr/local/opt/openjdk@16/include"' >> ~/.zshrc
source ~/.zshrc
```

### Step 4: Verify the installation

```bash
java -version
```

You should see output similar to:

```plaintext
openjdk version "16.0.2" 2021-07-20
OpenJDK Runtime Environment Homebrew (build 16.0.2+7)
OpenJDK 64-Bit Server VM Homebrew (build 16.0.2+7, mixed mode)
```

---

## Installing OpenJDK 17 on Linux

Debian based distros currenly have openjdk 17 on their repository. 

### Step 1: Update the package index

```bash
sudo apt update
```

### Step 2: Install OpenJDK 16

```bash
sudo apt install openjdk-17-jdk
```

### Step 3: Verify the installation

```bash
java -version
```

You should see output similar to:

```plaintext
openjdk version "17.0.2" 2021-07-20
OpenJDK Runtime Environment (build 17.0.2+7-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 17.0.2+7-Ubuntu-0ubuntu2.20.04, mixed mode, sharing)
```

---
