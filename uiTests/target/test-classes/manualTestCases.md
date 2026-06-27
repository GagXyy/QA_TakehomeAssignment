# Manual Test Cases

## Application
OrangeHRM Demo

## Module
Login

---

# TC_001

Test Description: Verify login with valid username and password

Steps:
1. Open the OrangeHRM login page.
2. Enter a valid username.
3. Enter a valid password.
4. Click the Login button.

Expected Result:
The user should be successfully logged in and the Dashboard page should be displayed.

Priority: High

---

# TC_002

Test Description: Verify user can log out successfully

Steps:
1. Login with valid credentials.
2. Click the Profile icon.
3. Click Logout.

Expected Result:
The user should be logged out successfully and redirected to the Login page.

Priority: Medium

---

# TC_003

Test Description: Verify login with an invalid username

Steps:
1. Enter an invalid username.
2. Enter a valid password.
3. Click the Login button.

Expected Result:
An "Invalid credentials" error message should be displayed, and the user should remain on the Login page.

Priority: High

---

# TC_004

Test Description: Verify login with an invalid password

Steps:
1. Enter a valid username.
2. Enter an invalid password.
3. Click the Login button.

Expected Result:
An "Invalid credentials" error message should be displayed, and the login should fail.

Priority: High

---

# TC_005

Test Description: Verify login with empty username and password

Steps:
1. Leave the Username field empty.
2. Leave the Password field empty.
3. Click the Login button.

Expected Result:
Validation messages indicating that the Username and Password fields are required should be displayed.

Priority: High

---

# TC_006

Test Description: Verify login with a username exceeding the maximum allowed length (Boundary Test)

Steps:
1. Enter a username longer than the supported maximum length.
2. Enter any password.
3. Click the Login button.

Expected Result:
The application should reject the input or display an appropriate validation/error message without crashing.

Priority: Medium

---

# TC_007

Test Description: Verify login using only spaces in the Username and Password fields

Steps:
1. Enter only spaces in the Username field.
2. Enter only spaces in the Password field.
3. Click the Login button.

Expected Result:
The user should not be logged in, and an appropriate validation or error message should be displayed.

Priority: Medium