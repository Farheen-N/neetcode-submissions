class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        if s[0] == '}' or s[0] == ')' or s[0] == ']':
            return False
        stack.append(s[0])
        for i in s[1:]:
            if i == '}':
                if not stack:
                    return False
                elif stack.pop() == '{':
                    pass
                else:
                    return False
            elif i == ')':
                if not stack:
                    return False
                elif stack.pop() == '(':
                    pass
                else:
                    return False
            elif i == ']':
                if not stack:
                    return False
                elif stack.pop() == '[':
                    pass
                else:
                    return False
            else:
                stack.append(i)
        if len(stack) == 0:
            return True
        else:
            return False
        
        
        