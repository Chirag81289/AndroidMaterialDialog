/*
 * Copyright 2014 - 2017 Michael Rapp
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package de.mrapp.android.dialog.model;

/**
 * Defines the interface a dialog, which is designed according to Android 5's Material design
 * guidelines even on pre-Lollipop devices and may contain up to three buttons, must implement.
 *
 * @author Michael Rapp
 * @since 3.2.0
 */
public interface ButtonBarDialog extends ValidateableDialog, ButtonBarDialogDecorator {

}