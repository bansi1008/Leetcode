impl Solution {
    pub fn restore_ip_addresses(s: String) -> Vec<String> {
        fn backtrack(s: &str, start: usize, parts: &mut Vec<String>, result: &mut Vec<String>) {
            if parts.len() == 4 {
                if start == s.len() {
                    result.push(parts.join("."));
                }
                return;
            }

            for len in 1..=3 {
                if start + len > s.len() {
                    break;
                }

                let segment = &s[start..start + len];
                if segment.starts_with('0') && segment.len() > 1 {
                    continue;
                }

                if let Ok(value) = segment.parse::<u8>() {
                    parts.push(segment.to_string());
                    backtrack(s, start + len, parts, result);
                    parts.pop();
                }
            }
        }

        let mut result = Vec::new();
        let mut parts = Vec::new();
        backtrack(&s, 0, &mut parts, &mut result);
        result
    }
}
