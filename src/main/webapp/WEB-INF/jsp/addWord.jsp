<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Add word</title>
</head>
<body>
<form method="post" action="/users/${id}/addWord">
    <label>english<input type="text" name="english"></label>
    <br>
    <label>russian<input type="text" name="russian"></label>
    <br>
    <label>transcription<input type="text" name="transcription"></label>
    <br>
    <label>type<select name="type">
        <option>ADJECTIVE</option>
        <option>ADVERB</option>
        <option>AUXILIARY_VERB</option>
        <option>DETERMINER</option>
        <option>EXCLAMATION</option>
        <option>MODAL_VERB</option>
        <option>NOUN</option>
        <option>PHRASAL_VERB</option>
        <option>PHRASE</option>
        <option>PREPOSITION</option>
        <option>PRONOUN</option>
        <option>VERB</option>
    </select></label>
    <br>
    <label>english level<select name="english_level">
        <option>A1</option>
        <option>A2</option>
        <option>B1</option>
        <option>B2</option>
        <option>C1</option>
        <option>C2</option>
        <option>UNDEFINED</option>
    </select></label>
    <br>
    <button type="submit">add</button>
</form>
</body>
</html>
